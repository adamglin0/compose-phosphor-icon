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

public val BoldGroup.`Hash-bold`: ImageVector
    get() {
        if (`_hash-bold` != null) {
            return `_hash-bold`!!
        }
        `_hash-bold` = Builder(name = "Hash-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 84.0f)
                lineTo(180.2f, 84.0f)
                lineToRelative(7.61f, -41.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.62f, -4.3f)
                lineTo(155.8f, 84.0f)
                lineTo(116.2f, 84.0f)
                lineToRelative(7.61f, -41.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -23.62f, -4.3f)
                lineTo(91.8f, 84.0f)
                lineTo(48.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(87.44f, 108.0f)
                lineToRelative(-7.27f, 40.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(75.8f, 172.0f)
                lineToRelative(-7.61f, 41.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.66f, 14.0f)
                arcTo(11.43f, 11.43f, 0.0f, false, false, 80.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.86f)
                lineTo(100.2f, 172.0f)
                horizontalLineToRelative(39.6f)
                lineToRelative(-7.61f, 41.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.66f, 14.0f)
                arcToRelative(11.43f, 11.43f, 0.0f, false, false, 2.16f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.8f, -9.86f)
                lineTo(164.2f, 172.0f)
                lineTo(208.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(168.56f, 148.0f)
                lineToRelative(7.27f, -40.0f)
                lineTo(224.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(144.17f, 148.0f)
                lineTo(104.56f, 148.0f)
                lineToRelative(7.27f, -40.0f)
                horizontalLineToRelative(39.61f)
                close()
            }
        }
        .build()
        return `_hash-bold`!!
    }

private var `_hash-bold`: ImageVector? = null
