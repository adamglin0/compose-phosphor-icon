package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Cloud-slash-light`: ImageVector
    get() {
        if (`_cloud-slash-light` != null) {
            return `_cloud-slash-light`!!
        }
        `_cloud-slash-light` = Builder(name = "Cloud-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineToRelative(40.18f, 44.2f)
                curveToRelative(-0.45f, 0.87f, -0.9f, 1.75f, -1.32f, 2.64f)
                arcTo(62.0f, 62.0f, 0.0f, true, false, 72.0f, 214.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(85.23f, 85.23f, 0.0f, false, false, 32.35f, -6.3f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(160.0f, 202.0f)
                lineTo(72.0f, 202.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 5.9f, -99.64f)
                arcTo(86.25f, 86.25f, 0.0f, false, false, 74.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(73.92f, 73.92f, 0.0f, false, true, 6.44f, -30.2f)
                lineToRelative(91.22f, 100.34f)
                arcTo(73.65f, 73.65f, 0.0f, false, true, 160.0f, 202.0f)
                close()
                moveTo(246.0f, 128.0f)
                arcToRelative(85.85f, 85.85f, 0.0f, false, true, -21.85f, 57.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.47f, -10.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -99.0f, -108.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.11f, -9.67f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cloud-slash-light`!!
    }

private var `_cloud-slash-light`: ImageVector? = null
