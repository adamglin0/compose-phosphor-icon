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

public val BoldGroup.Minuscircle: ImageVector
    get() {
        if (_minuscircle != null) {
            return _minuscircle!!
        }
        _minuscircle = Builder(name = "Minuscircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 128.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _minuscircle!!
    }

private var _minuscircle: ImageVector? = null
