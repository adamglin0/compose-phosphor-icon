package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Push-pin-slash-fill`: ImageVector
    get() {
        if (`_push-pin-slash-fill` != null) {
            return `_push-pin-slash-fill`!!
        }
        `_push-pin-slash-fill` = Builder(name = "Push-pin-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.33f, 104.0f)
                lineToRelative(-47.62f, 47.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.79f, -0.14f)
                lineTo(108.0f, 70.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.13f, -5.51f)
                lineTo(152.0f, 20.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.33f, 104.0f)
                close()
                moveTo(53.92f, 34.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.0f, 0.21f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 0.37f, 10.75f)
                lineTo(67.32f, 73.15f)
                curveTo(58.26f, 75.09f, 48.2f, 79.37f, 38.0f, 87.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.29f, 23.78f)
                lineTo(85.0f, 159.71f)
                lineTo(42.55f, 202.14f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -0.6f, 11.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, 0.43f)
                lineTo(96.29f, 171.0f)
                lineToRelative(48.29f, 48.29f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 155.9f, 224.0f)
                curveToRelative(0.38f, 0.0f, 0.75f, 0.0f, 1.13f, 0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 11.64f, -6.33f)
                arcToRelative(88.62f, 88.62f, 0.0f, false, false, 11.64f, -20.2f)
                lineToRelative(21.77f, 23.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return `_push-pin-slash-fill`!!
    }

private var `_push-pin-slash-fill`: ImageVector? = null
