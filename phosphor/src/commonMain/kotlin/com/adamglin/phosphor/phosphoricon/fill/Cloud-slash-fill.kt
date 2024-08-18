package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Cloud-slash-fill`: ImageVector
    get() {
        if (`_cloud-slash-fill` != null) {
            return `_cloud-slash-fill`!!
        }
        `_cloud-slash-fill` = Builder(name = "Cloud-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.72f)
                arcTo(87.74f, 87.74f, 0.0f, false, true, 222.41f, 190.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.77f, -0.16f)
                lineTo(103.78f, 65.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.39f, -5.76f)
                arcTo(87.82f, 87.82f, 0.0f, false, true, 160.87f, 40.0f)
                curveTo(209.15f, 40.47f, 248.38f, 80.43f, 248.0f, 128.72f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.33f, 88.56f)
                lineToRelative(-0.06f, 0.11f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 8.0f, 153.0f)
                curveToRelative(0.53f, 35.12f, 29.84f, 63.0f, 65.0f, 63.0f)
                horizontalLineToRelative(87.0f)
                arcToRelative(87.65f, 87.65f, 0.0f, false, false, 31.78f, -5.95f)
                lineToRelative(10.3f, 11.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.33f, 0.52f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, false, 0.29f, -11.52f)
                close()
            }
        }
        .build()
        return `_cloud-slash-fill`!!
    }

private var `_cloud-slash-fill`: ImageVector? = null
