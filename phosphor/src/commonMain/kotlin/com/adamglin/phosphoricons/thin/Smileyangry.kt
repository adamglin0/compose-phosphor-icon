package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) {
            return _smileyAngry!!
        }
        _smileyAngry = Builder(name = "SmileyAngry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(164.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 132.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, false, -92.0f, 92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 220.0f, 128.0f)
                close()
                moveTo(173.78f, 84.67f)
                lineTo(128.0f, 115.19f)
                lineTo(82.22f, 84.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.44f, 6.66f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, 0.0f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.44f, -6.66f)
                close()
                moveTo(154.21f, 180.67f)
                curveToRelative(-7.82f, -5.2f, -15.27f, -8.67f, -26.21f, -8.67f)
                reflectiveCurveToRelative(-18.39f, 3.47f, -26.21f, 8.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.42f, 6.66f)
                curveTo(113.2f, 182.69f, 119.0f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(14.8f, 2.69f, 21.79f, 7.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.42f, -6.66f)
                close()
            }
        }
        .build()
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
