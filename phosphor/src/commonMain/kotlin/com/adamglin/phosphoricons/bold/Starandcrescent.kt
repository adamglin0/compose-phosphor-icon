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

public val BoldGroup.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.46f, 195.72f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 0.0f, -135.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -21.37f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 0.0f, 178.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -21.37f)
                close()
                moveTo(112.0f, 204.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 0.0f, -152.0f)
                arcToRelative(77.2f, 77.2f, 0.0f, false, true, 13.57f, 1.19f)
                arcToRelative(100.14f, 100.14f, 0.0f, false, false, 0.0f, 149.62f)
                arcTo(77.2f, 77.2f, 0.0f, false, true, 112.0f, 204.0f)
                close()
                moveTo(248.75f, 117.0f)
                lineTo(224.47f, 106.5f)
                lineToRelative(-2.12f, -27.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.22f, -6.72f)
                lineToRelative(-17.0f, 20.58f)
                lineToRelative(-25.26f, -6.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.22f, 17.73f)
                lineTo(159.54f, 128.0f)
                lineToRelative(-13.88f, 23.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.22f, 17.73f)
                lineToRelative(25.26f, -6.25f)
                lineToRelative(17.0f, 20.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.26f, 4.36f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 3.62f, -0.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.34f, -10.52f)
                lineToRelative(2.12f, -27.42f)
                lineTo(248.75f, 139.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.0f)
                close()
                moveTo(208.31f, 130.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.21f, 10.09f)
                lineToRelative(-0.39f, 5.0f)
                lineTo(197.84f, 142.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.25f, -4.36f)
                arcToRelative(11.76f, 11.76f, 0.0f, false, false, -2.88f, 0.35f)
                lineToRelative(-4.89f, 1.21f)
                lineToRelative(3.0f, -5.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -12.18f)
                lineToRelative(-3.0f, -5.07f)
                lineToRelative(4.89f, 1.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.13f, -4.0f)
                lineToRelative(2.87f, -3.48f)
                lineToRelative(0.39f, 5.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.21f, 10.09f)
                lineToRelative(5.4f, 2.33f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
