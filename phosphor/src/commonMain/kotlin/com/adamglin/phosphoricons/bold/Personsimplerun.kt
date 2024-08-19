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

public val BoldGroup.Personsimplerun: ImageVector
    get() {
        if (_personsimplerun != null) {
            return _personsimplerun!!
        }
        _personsimplerun = Builder(name = "Personsimplerun", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 92.0f)
                close()
                moveTo(152.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 44.0f)
                close()
                moveTo(228.0f, 137.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.0f, 10.91f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -21.47f, 3.78f)
                curveToRelative(-14.0f, 0.0f, -34.25f, -3.82f, -59.77f, -19.0f)
                arcToRelative(177.0f, 177.0f, 0.0f, false, true, -10.27f, 21.0f)
                curveTo(153.12f, 162.83f, 188.0f, 183.8f, 188.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveToRelative(0.0f, -18.69f, -6.95f, -33.06f, -21.26f, -43.94f)
                curveToRelative(-9.16f, -7.0f, -19.55f, -11.0f, -27.43f, -13.34f)
                curveToRelative(-0.81f, 1.0f, -1.64f, 2.0f, -2.5f, 2.95f)
                curveToRelative(-20.0f, 22.87f, -44.82f, 34.76f, -72.25f, 34.76f)
                arcToRelative(97.33f, 97.33f, 0.0f, false, true, -9.75f, -0.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 2.39f, -23.88f)
                curveToRelative(52.3f, 5.22f, 77.48f, -45.92f, 85.79f, -67.75f)
                curveTo(84.8f, 102.46f, 63.74f, 118.78f, 63.51f, 119.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, -18.72f)
                curveTo(50.08f, 99.0f, 88.0f, 69.44f, 142.75f, 106.62f)
                curveToRelative(43.1f, 29.31f, 68.1f, 19.92f, 68.5f, 19.76f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.75f, 11.0f)
                close()
            }
        }
        .build()
        return _personsimplerun!!
    }

private var _personsimplerun: ImageVector? = null
