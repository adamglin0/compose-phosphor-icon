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

public val FillGroup.`Soccer-ball-fill`: ImageVector
    get() {
        if (`_soccer-ball-fill` != null) {
            return `_soccer-ball-fill`!!
        }
        `_soccer-ball-fill` = Builder(name = "Soccer-ball-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(136.0f, 63.38f)
                lineTo(160.79f, 46.33f)
                arcToRelative(88.41f, 88.41f, 0.0f, false, true, 36.18f, 27.0f)
                lineToRelative(-8.0f, 26.94f)
                curveToRelative(-0.2f, 0.0f, -0.41f, 0.1f, -0.61f, 0.17f)
                lineToRelative(-22.82f, 7.41f)
                arcToRelative(7.59f, 7.59f, 0.0f, false, false, -1.0f, 0.4f)
                lineTo(136.0f, 88.62f)
                curveToRelative(0.0f, -0.2f, 0.0f, -0.41f, 0.0f, -0.62f)
                lineTo(136.0f, 64.0f)
                curveTo(136.0f, 63.79f, 136.0f, 63.58f, 136.0f, 63.38f)
                close()
                moveTo(95.24f, 46.33f)
                lineTo(120.0f, 63.38f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.41f, 0.0f, 0.62f)
                lineTo(120.0f, 88.0f)
                curveToRelative(0.0f, 0.21f, 0.0f, 0.42f, 0.0f, 0.62f)
                lineTo(91.44f, 108.29f)
                arcToRelative(7.59f, 7.59f, 0.0f, false, false, -1.0f, -0.4f)
                lineToRelative(-22.82f, -7.41f)
                curveToRelative(-0.2f, -0.07f, -0.41f, -0.12f, -0.61f, -0.17f)
                lineToRelative(-8.0f, -26.94f)
                arcTo(88.41f, 88.41f, 0.0f, false, true, 95.24f, 46.33f)
                close()
                moveTo(82.24f, 175.42f)
                lineTo(53.9f, 175.42f)
                arcToRelative(87.4f, 87.4f, 0.0f, false, true, -13.79f, -43.07f)
                lineToRelative(22.0f, -16.88f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, 0.58f, 0.22f)
                lineToRelative(22.83f, 7.42f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.93f, 0.22f)
                lineToRelative(10.79f, 31.42f)
                curveToRelative(-0.15f, 0.18f, -0.3f, 0.36f, -0.44f, 0.55f)
                lineTo(82.7f, 174.71f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 82.24f, 175.42f)
                close()
                moveTo(150.69f, 213.0f)
                arcToRelative(88.16f, 88.16f, 0.0f, false, true, -45.38f, 0.0f)
                lineTo(95.25f, 184.6f)
                curveToRelative(0.13f, -0.16f, 0.27f, -0.31f, 0.39f, -0.48f)
                lineToRelative(14.11f, -19.42f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.46f, -0.7f)
                horizontalLineToRelative(35.58f)
                arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.46f, 0.7f)
                lineToRelative(14.11f, 19.42f)
                curveToRelative(0.12f, 0.17f, 0.26f, 0.32f, 0.39f, 0.48f)
                close()
                moveTo(173.76f, 175.39f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -0.46f, -0.71f)
                lineTo(159.19f, 155.3f)
                curveToRelative(-0.14f, -0.19f, -0.29f, -0.37f, -0.44f, -0.55f)
                lineToRelative(10.79f, -31.42f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.93f, -0.22f)
                lineToRelative(22.83f, -7.42f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, 0.58f, -0.22f)
                lineToRelative(22.0f, 16.88f)
                arcToRelative(87.4f, 87.4f, 0.0f, false, true, -13.79f, 43.07f)
                close()
            }
        }
        .build()
        return `_soccer-ball-fill`!!
    }

private var `_soccer-ball-fill`: ImageVector? = null
