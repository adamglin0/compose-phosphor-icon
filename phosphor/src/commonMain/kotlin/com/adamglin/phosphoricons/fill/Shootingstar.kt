package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Shootingstar: ImageVector
    get() {
        if (_shootingstar != null) {
            return _shootingstar!!
        }
        _shootingstar = Builder(name = "Shootingstar", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.24f, 84.38f)
                lineToRelative(-28.06f, 23.68f)
                lineToRelative(8.56f, 35.39f)
                arcToRelative(13.34f, 13.34f, 0.0f, false, true, -5.09f, 13.91f)
                arcToRelative(13.54f, 13.54f, 0.0f, false, true, -15.0f, 0.69f)
                lineTo(164.0f, 139.0f)
                lineToRelative(-31.65f, 19.06f)
                arcToRelative(13.51f, 13.51f, 0.0f, false, true, -15.0f, -0.69f)
                arcToRelative(13.32f, 13.32f, 0.0f, false, true, -5.1f, -13.91f)
                lineToRelative(8.56f, -35.39f)
                lineTo(92.76f, 84.38f)
                arcToRelative(13.39f, 13.39f, 0.0f, false, true, 7.66f, -23.58f)
                lineToRelative(36.94f, -2.92f)
                lineToRelative(14.21f, -33.66f)
                arcToRelative(13.51f, 13.51f, 0.0f, false, true, 24.86f, 0.0f)
                lineToRelative(14.21f, 33.66f)
                lineToRelative(36.94f, 2.92f)
                arcToRelative(13.39f, 13.39f, 0.0f, false, true, 7.66f, 23.58f)
                close()
                moveTo(88.11f, 111.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(18.34f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(58.45f, -58.45f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.11f, 111.89f)
                close()
                moveTo(87.61f, 173.08f)
                lineTo(34.34f, 226.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(53.26f, -53.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                close()
                moveTo(160.61f, 172.08f)
                lineTo(106.32f, 226.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(54.28f, -54.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                close()
            }
        }
        .build()
        return _shootingstar!!
    }

private var _shootingstar: ImageVector? = null
