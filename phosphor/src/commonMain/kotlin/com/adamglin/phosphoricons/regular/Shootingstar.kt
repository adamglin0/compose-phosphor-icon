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

public val RegularGroup.ShootingStar: ImageVector
    get() {
        if (_shootingStar != null) {
            return _shootingStar!!
        }
        _shootingStar = Builder(name = "ShootingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.35f, 70.08f)
                arcToRelative(13.41f, 13.41f, 0.0f, false, false, -11.77f, -9.28f)
                lineToRelative(-36.94f, -2.92f)
                lineTo(176.43f, 24.22f)
                arcToRelative(13.51f, 13.51f, 0.0f, false, false, -24.86f, 0.0f)
                lineTo(137.36f, 57.88f)
                lineTo(100.42f, 60.8f)
                arcToRelative(13.39f, 13.39f, 0.0f, false, false, -7.66f, 23.58f)
                lineToRelative(28.06f, 23.68f)
                lineToRelative(-8.56f, 35.39f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, false, 5.1f, 13.91f)
                arcToRelative(13.51f, 13.51f, 0.0f, false, false, 15.0f, 0.69f)
                lineTo(164.0f, 139.0f)
                lineToRelative(31.65f, 19.06f)
                arcToRelative(13.54f, 13.54f, 0.0f, false, false, 15.0f, -0.69f)
                arcToRelative(13.34f, 13.34f, 0.0f, false, false, 5.09f, -13.91f)
                lineToRelative(-8.56f, -35.39f)
                lineToRelative(28.06f, -23.68f)
                arcTo(13.32f, 13.32f, 0.0f, false, false, 239.35f, 70.08f)
                close()
                moveTo(193.08f, 99.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.61f, 8.0f)
                lineToRelative(8.28f, 34.21f)
                lineTo(168.13f, 122.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.25f, 0.0f)
                lineToRelative(-30.62f, 18.43f)
                lineTo(137.54f, 107.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.62f, -8.0f)
                lineTo(108.0f, 76.26f)
                lineToRelative(35.52f, -2.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, -4.87f)
                lineTo(164.0f, 35.91f)
                lineToRelative(13.79f, 32.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, 4.87f)
                lineToRelative(35.53f, 2.81f)
                close()
                moveTo(88.08f, 123.18f)
                lineTo(29.66f, 181.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(58.45f, -58.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(98.89f, 173.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                lineTo(45.66f, 237.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(53.27f, -53.26f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 98.92f, 173.08f)
                close()
                moveTo(171.89f, 172.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-54.28f, 54.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(54.29f, -54.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 171.94f, 172.06f)
                close()
            }
        }
        .build()
        return _shootingStar!!
    }

private var _shootingStar: ImageVector? = null
