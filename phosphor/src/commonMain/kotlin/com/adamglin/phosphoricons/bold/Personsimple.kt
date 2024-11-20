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

public val BoldGroup.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) {
            return _personSimple!!
        }
        _personSimple = Builder(name = "PersonSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 92.0f, 48.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(234.29f, 138.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.47f, 4.12f)
                curveToRelative(-0.32f, -0.19f, -32.37f, -18.92f, -77.82f, -21.88f)
                verticalLineToRelative(27.0f)
                lineTo(201.0f, 216.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 183.0f, 232.0f)
                lineToRelative(-55.0f, -61.91f)
                lineTo(73.0f, 232.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 55.0f, 216.0f)
                lineToRelative(61.0f, -68.59f)
                verticalLineToRelative(-27.0f)
                curveToRelative(-45.72f, 2.95f, -77.48f, 21.68f, -77.82f, 21.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.35f, -20.58f)
                curveTo(27.58f, 120.66f, 69.35f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveToRelative(100.42f, 24.66f, 102.17f, 25.71f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 234.29f, 138.17f)
                close()
            }
        }
        .build()
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
