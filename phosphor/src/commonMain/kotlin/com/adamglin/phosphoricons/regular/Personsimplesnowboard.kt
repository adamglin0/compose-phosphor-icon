package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Personsimplesnowboard: ImageVector
    get() {
        if (_personsimplesnowboard != null) {
            return _personsimplesnowboard!!
        }
        _personsimplesnowboard = Builder(name = "Personsimplesnowboard", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 80.0f)
                close()
                moveTo(164.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 40.0f)
                close()
                moveTo(218.25f, 112.32f)
                lineTo(82.25f, 72.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.52f, 15.35f)
                lineToRelative(40.85f, 12.0f)
                lineTo(85.07f, 150.0f)
                lineTo(40.34f, 137.0f)
                arcToRelative(25.18f, 25.18f, 0.0f, true, false, -14.13f, 48.34f)
                lineTo(183.65f, 231.0f)
                arcToRelative(25.88f, 25.88f, 0.0f, false, false, 7.14f, 1.0f)
                arcToRelative(25.17f, 25.17f, 0.0f, false, false, 7.0f, -49.36f)
                lineToRelative(-50.89f, -14.75f)
                lineToRelative(19.75f, -29.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.42f, -12.14f)
                lineToRelative(-35.33f, -10.23f)
                lineToRelative(7.78f, -11.67f)
                lineToRelative(79.07f, 23.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.51f, -15.35f)
                close()
                moveTo(200.0f, 206.81f)
                arcToRelative(9.07f, 9.07f, 0.0f, false, true, -3.67f, 7.3f)
                arcToRelative(9.27f, 9.27f, 0.0f, false, true, -8.22f, 1.5f)
                lineTo(30.67f, 170.0f)
                arcToRelative(9.24f, 9.24f, 0.0f, false, true, -6.67f, -8.8f)
                arcToRelative(9.06f, 9.06f, 0.0f, false, true, 3.66f, -7.3f)
                arcToRelative(9.26f, 9.26f, 0.0f, false, true, 8.23f, -1.5f)
                lineTo(193.33f, 198.0f)
                arcTo(9.23f, 9.23f, 0.0f, false, true, 200.0f, 206.81f)
                close()
                moveTo(147.25f, 138.63f)
                lineTo(130.76f, 163.22f)
                lineTo(101.18f, 154.64f)
                lineTo(117.58f, 130.04f)
                close()
            }
        }
        .build()
        return _personsimplesnowboard!!
    }

private var _personsimplesnowboard: ImageVector? = null
