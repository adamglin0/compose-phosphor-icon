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

public val BoldGroup.`Sword-bold`: ImageVector
    get() {
        if (`_sword-bold` != null) {
            return `_sword-bold`!!
        }
        `_sword-bold` = Builder(name = "Sword-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 28.0f)
                lineTo(152.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.33f, 4.45f)
                lineTo(79.5f, 110.51f)
                lineToRelative(-4.66f, -4.65f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f)
                lineTo(29.86f, 122.55f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                horizontalLineToRelative(0.0f)
                lineTo(45.0f, 166.0f)
                lineTo(23.86f, 187.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(16.69f, 16.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineTo(90.0f, 211.0f)
                lineToRelative(15.17f, 15.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(16.69f, -16.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.3f)
                lineToRelative(-4.65f, -4.65f)
                lineToRelative(78.06f, -63.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 104.0f)
                lineTo(228.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 28.0f)
                close()
                moveTo(54.69f, 212.34f)
                lineToRelative(-11.0f, -11.0f)
                lineTo(62.0f, 183.0f)
                lineToRelative(11.0f, 11.0f)
                close()
                moveTo(119.3f, 206.34f)
                lineTo(49.65f, 136.7f)
                lineToRelative(11.05f, -11.0f)
                lineToRelative(69.65f, 69.65f)
                close()
                moveTo(204.0f, 98.27f)
                lineToRelative(-75.58f, 61.17f)
                lineTo(121.0f, 152.0f)
                lineToRelative(47.51f, -47.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(104.0f, 135.0f)
                lineToRelative(-7.45f, -7.44f)
                lineTo(157.73f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
            }
        }
        .build()
        return `_sword-bold`!!
    }

private var `_sword-bold`: ImageVector? = null
