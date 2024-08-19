package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Cheese-bold`: ImageVector
    get() {
        if (`_cheese-bold` != null) {
            return `_cheese-bold`!!
        }
        `_cheese-bold` = Builder(name = "Cheese-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, -3.45f, 0.51f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, true, 12.0f, 11.76f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -3.43f, 8.38f)
                arcTo(12.88f, 12.88f, 0.0f, false, true, 31.46f, 148.0f)
                lineTo(24.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 88.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(185.64f, 52.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, true, 32.3f, 24.0f)
                lineTo(105.76f, 76.0f)
                close()
                moveTo(152.0f, 100.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(96.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(220.0f, 180.0f)
                lineTo(152.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                lineTo(36.0f, 180.0f)
                verticalLineToRelative(-8.29f)
                arcTo(37.09f, 37.09f, 0.0f, false, false, 57.7f, 161.0f)
                arcTo(35.39f, 35.39f, 0.0f, false, false, 68.0f, 135.31f)
                arcToRelative(36.21f, 36.21f, 0.0f, false, false, -32.0f, -35.09f)
                lineTo(36.0f, 100.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return `_cheese-bold`!!
    }

private var `_cheese-bold`: ImageVector? = null
