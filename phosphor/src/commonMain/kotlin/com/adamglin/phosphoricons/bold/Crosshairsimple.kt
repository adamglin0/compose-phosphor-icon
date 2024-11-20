package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) {
            return _crosshairSimple!!
        }
        _crosshairSimple = Builder(name = "CrosshairSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(140.0f, 211.13f)
                lineTo(140.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(27.13f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 44.87f, 140.0f)
                lineTo(72.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(44.87f, 116.0f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 116.0f, 44.87f)
                lineTo(116.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 44.87f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 211.13f, 116.0f)
                lineTo(184.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(27.13f)
                arcTo(84.18f, 84.18f, 0.0f, false, true, 140.0f, 211.13f)
                close()
            }
        }
        .build()
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
