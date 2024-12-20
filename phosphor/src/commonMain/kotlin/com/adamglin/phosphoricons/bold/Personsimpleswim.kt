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

public val BoldGroup.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) {
            return _personSimpleSwim!!
        }
        _personSimpleSwim = Builder(name = "PersonSimpleSwim", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.44f, 108.6f)
                lineToRelative(6.24f, -6.24f)
                arcTo(83.54f, 83.54f, 0.0f, false, false, 56.24f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(56.24f, 68.0f)
                arcTo(107.28f, 107.28f, 0.0f, false, true, 132.6f, 99.64f)
                lineToRelative(40.25f, 40.25f)
                curveToRelative(10.74f, 0.27f, 22.11f, -3.64f, 35.49f, -14.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.32f, 18.47f)
                curveTo(205.49f, 158.7f, 189.06f, 164.0f, 174.15f, 164.0f)
                curveToRelative(-19.76f, 0.0f, -36.86f, -9.29f, -51.88f, -17.45f)
                curveToRelative(-25.06f, -13.61f, -44.86f, -24.36f, -74.61f, 0.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.32f, -18.48f)
                curveTo(54.07f, 110.36f, 73.3f, 106.32f, 90.44f, 108.6f)
                close()
                moveTo(140.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 140.0f, 72.0f)
                close()
                moveTo(164.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 72.0f)
                close()
                moveTo(208.34f, 181.16f)
                curveToRelative(-29.75f, 24.67f, -49.55f, 13.92f, -74.61f, 0.3f)
                curveToRelative(-26.35f, -14.3f, -59.14f, -32.11f, -101.39f, 2.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.32f, 18.47f)
                curveToRelative(29.75f, -24.66f, 49.55f, -13.92f, 74.61f, -0.3f)
                curveToRelative(15.0f, 8.15f, 32.12f, 17.44f, 51.88f, 17.44f)
                curveToRelative(14.91f, 0.0f, 31.34f, -5.29f, 49.51f, -20.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.32f, -18.48f)
                close()
            }
        }
        .build()
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
