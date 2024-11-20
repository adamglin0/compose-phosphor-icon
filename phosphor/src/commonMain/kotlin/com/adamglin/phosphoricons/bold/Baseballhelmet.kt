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

public val BoldGroup.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) {
            return _baseballHelmet!!
        }
        _baseballHelmet = Builder(name = "BaseballHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 156.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 120.0f, 156.0f)
                close()
                moveTo(80.0f, 156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 156.0f)
                close()
                moveTo(244.0f, 116.0f)
                lineTo(227.34f, 116.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 12.0f, 128.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, 76.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, -76.0f)
                lineTo(204.0f, 140.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(36.0f, 152.0f)
                lineTo(36.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 167.15f, -12.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -104.0f, 0.0f)
                close()
                moveTo(180.0f, 152.0f)
                arcToRelative(52.07f, 52.07f, 0.0f, false, true, -33.67f, 48.65f)
                arcTo(75.63f, 75.63f, 0.0f, false, false, 164.0f, 152.0f)
                lineTo(164.0f, 140.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
