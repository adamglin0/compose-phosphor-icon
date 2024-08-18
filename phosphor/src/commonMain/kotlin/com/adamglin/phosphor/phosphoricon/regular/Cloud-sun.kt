package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Cloud-sun`: ImageVector
    get() {
        if (`_cloud-sun` != null) {
            return `_cloud-sun`!!
        }
        `_cloud-sun` = Builder(name = "Cloud-sun", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 72.0f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, false, -20.26f, 2.73f)
                arcToRelative(55.63f, 55.63f, 0.0f, false, false, -9.41f, -11.54f)
                lineToRelative(9.51f, -13.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.11f, -9.18f)
                lineTo(121.22f, 54.0f)
                arcTo(55.9f, 55.9f, 0.0f, false, false, 96.0f, 48.0f)
                curveToRelative(-0.58f, 0.0f, -1.16f, 0.0f, -1.74f, 0.0f)
                lineTo(91.37f, 31.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.75f, 2.77f)
                lineTo(78.5f, 50.82f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 55.23f, 65.67f)
                lineTo(41.61f, 56.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.17f, 13.11f)
                lineTo(46.0f, 78.77f)
                arcTo(55.55f, 55.55f, 0.0f, false, false, 40.0f, 104.0f)
                curveToRelative(0.0f, 0.57f, 0.0f, 1.15f, 0.0f, 1.72f)
                lineTo(23.71f, 108.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.38f, 15.88f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, false, 1.39f, -0.12f)
                lineToRelative(16.32f, -2.88f)
                arcToRelative(55.74f, 55.74f, 0.0f, false, false, 5.86f, 12.42f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 84.0f, 224.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(56.0f, 104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 72.54f, -23.24f)
                arcToRelative(76.26f, 76.26f, 0.0f, false, false, -35.62f, 40.0f)
                arcToRelative(52.14f, 52.14f, 0.0f, false, false, -31.0f, 4.17f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 56.0f, 104.0f)
                close()
                moveTo(164.0f, 208.0f)
                horizontalLineTo(84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 4.78f, -71.69f)
                curveToRelative(-0.37f, 2.37f, -0.63f, 4.79f, -0.77f, 7.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.92f)
                arcToRelative(58.91f, 58.91f, 0.0f, false, true, 1.88f, -11.81f)
                curveToRelative(0.0f, -0.16f, 0.09f, -0.32f, 0.12f, -0.48f)
                arcTo(60.06f, 60.06f, 0.0f, true, true, 164.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_cloud-sun`!!
    }

private var `_cloud-sun`: ImageVector? = null
