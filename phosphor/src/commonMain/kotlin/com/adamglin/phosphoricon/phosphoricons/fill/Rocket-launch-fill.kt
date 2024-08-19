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

public val FillGroup.`Rocket-launch-fill`: ImageVector
    get() {
        if (`_rocket-launch-fill` != null) {
            return `_rocket-launch-fill`!!
        }
        `_rocket-launch-fill` = Builder(name = "Rocket-launch-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(101.85f, 191.14f)
                curveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -42.29f, 23.0f, -57.34f, 32.86f, -61.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.64f, 14.56f)
                curveToRelative(-6.43f, 2.93f, -20.62f, 12.36f, -23.12f, 38.91f)
                curveToRelative(26.55f, -2.5f, 36.0f, -16.69f, 38.91f, -23.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.56f, 6.64f)
                close()
                moveTo(223.85f, 47.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.0f, -15.0f)
                curveToRelative(-12.58f, -0.75f, -44.73f, 0.4f, -71.4f, 27.07f)
                horizontalLineToRelative(0.0f)
                lineTo(88.0f, 108.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 76.67f, 97.39f)
                lineToRelative(26.56f, -26.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.41f, 64.0f)
                lineTo(74.35f, 64.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 63.0f, 68.68f)
                lineTo(28.7f, 103.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.07f, 27.16f)
                lineToRelative(38.47f, 5.37f)
                lineToRelative(44.21f, 44.21f)
                lineToRelative(5.37f, 38.49f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.78f, 12.92f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, 5.1f, 0.83f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 153.0f, 227.3f)
                lineTo(187.32f, 193.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 181.65f)
                lineTo(192.0f, 155.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.83f, -2.82f)
                lineToRelative(-26.57f, 26.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.71f, -0.42f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.6f, -11.1f)
                lineToRelative(49.27f, -49.27f)
                horizontalLineToRelative(0.0f)
                curveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f)
                close()
            }
        }
        .build()
        return `_rocket-launch-fill`!!
    }

private var `_rocket-launch-fill`: ImageVector? = null
