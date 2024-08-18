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

public val RegularGroup.`Cloud-moon`: ImageVector
    get() {
        if (`_cloud-moon` != null) {
            return `_cloud-moon`!!
        }
        `_cloud-moon` = Builder(name = "Cloud-moon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 72.0f)
                arcToRelative(76.45f, 76.45f, 0.0f, false, false, -12.36f, 1.0f)
                arcTo(71.93f, 71.93f, 0.0f, false, false, 104.17f, 9.83f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.58f)
                arcTo(56.05f, 56.05f, 0.0f, false, true, 40.0f, 88.0f)
                arcToRelative(56.45f, 56.45f, 0.0f, false, true, -12.59f, -1.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.59f)
                arcToRelative(72.22f, 72.22f, 0.0f, false, false, 32.29f, 45.06f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 92.0f, 224.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(37.37f, 104.0f)
                curveToRelative(0.87f, 0.0f, 1.75f, 0.0f, 2.63f, 0.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                curveToRelative(0.0f, -0.89f, 0.0f, -1.78f, 0.0f, -2.67f)
                arcToRelative(55.63f, 55.63f, 0.0f, false, true, 32.0f, 48.0f)
                arcToRelative(76.28f, 76.28f, 0.0f, false, false, -43.0f, 43.4f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 62.0f, 129.59f)
                arcTo(56.22f, 56.22f, 0.0f, false, true, 37.37f, 104.0f)
                close()
                moveTo(172.0f, 208.0f)
                horizontalLineTo(92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 4.78f, -71.69f)
                curveToRelative(-0.37f, 2.37f, -0.63f, 4.79f, -0.77f, 7.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.92f)
                arcToRelative(58.91f, 58.91f, 0.0f, false, true, 1.88f, -11.81f)
                curveToRelative(0.0f, -0.16f, 0.09f, -0.32f, 0.12f, -0.48f)
                arcTo(60.06f, 60.06f, 0.0f, true, true, 172.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_cloud-moon`!!
    }

private var `_cloud-moon`: ImageVector? = null
