package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Van-thin`: ImageVector
    get() {
        if (`_van-thin` != null) {
            return `_van-thin`!!
        }
        `_van-thin` = Builder(name = "Van-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.0f, 109.4f)
                lineTo(205.47f, 56.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.21f, -4.3f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(52.29f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                horizontalLineToRelative(56.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                lineTo(240.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 251.0f, 109.4f)
                close()
                moveTo(199.36f, 61.47f)
                lineTo(239.3f, 108.0f)
                lineTo(172.0f, 108.0f)
                lineTo(172.0f, 60.0f)
                horizontalLineToRelative(24.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 199.36f, 61.47f)
                close()
                moveTo(100.0f, 108.0f)
                lineTo(100.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(32.0f, 60.0f)
                lineTo(92.0f, 60.0f)
                verticalLineToRelative(48.0f)
                lineTo(28.0f, 108.0f)
                lineTo(28.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 60.0f)
                close()
                moveTo(80.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 204.0f)
                close()
                moveTo(192.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
                moveTo(240.0f, 180.0f)
                lineTo(219.71f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(107.71f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 116.0f)
                lineTo(244.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 180.0f)
                close()
            }
        }
        .build()
        return `_van-thin`!!
    }

private var `_van-thin`: ImageVector? = null
