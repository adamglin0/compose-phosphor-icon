package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Spinner-ball`: ImageVector
    get() {
        if (`_spinner-ball` != null) {
            return `_spinner-ball`!!
        }
        `_spinner-ball` = Builder(name = "Spinner-ball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(215.82f, 122.46f)
                curveToRelative(-28.34f, 20.0f, -49.57f, 14.68f, -71.87f, 4.39f)
                curveToRelative(20.06f, -14.19f, 38.86f, -32.21f, 39.53f, -67.11f)
                arcTo(87.92f, 87.92f, 0.0f, false, true, 215.82f, 122.46f)
                close()
                moveTo(167.11f, 49.19f)
                curveTo(170.24f, 83.71f, 155.0f, 99.44f, 135.0f, 113.61f)
                curveToRelative(-2.25f, -24.48f, -8.44f, -49.8f, -38.37f, -67.82f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, 70.5f, 3.4f)
                close()
                moveTo(79.32f, 54.73f)
                curveToRelative(31.45f, 14.55f, 37.47f, 35.58f, 39.71f, 60.0f)
                curveToRelative(-22.33f, -10.29f, -47.35f, -17.59f, -77.93f, -0.68f)
                arcTo(88.18f, 88.18f, 0.0f, false, true, 79.32f, 54.73f)
                close()
                moveTo(40.18f, 133.54f)
                curveToRelative(28.34f, -20.0f, 49.57f, -14.68f, 71.87f, -4.39f)
                curveTo(92.0f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f)
                arcTo(87.92f, 87.92f, 0.0f, false, true, 40.18f, 133.54f)
                close()
                moveTo(88.89f, 206.81f)
                curveTo(85.76f, 172.29f, 101.0f, 156.56f, 121.0f, 142.39f)
                curveToRelative(2.25f, 24.48f, 8.44f, 49.8f, 38.37f, 67.82f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, -70.5f, -3.4f)
                close()
                moveTo(176.68f, 201.27f)
                curveToRelative(-31.45f, -14.55f, -37.47f, -35.58f, -39.71f, -60.0f)
                curveToRelative(12.72f, 5.86f, 26.31f, 10.75f, 41.3f, 10.75f)
                curveToRelative(11.33f, 0.0f, 23.46f, -2.8f, 36.63f, -10.08f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 176.68f, 201.27f)
                close()
            }
        }
        .build()
        return `_spinner-ball`!!
    }

private var `_spinner-ball`: ImageVector? = null
