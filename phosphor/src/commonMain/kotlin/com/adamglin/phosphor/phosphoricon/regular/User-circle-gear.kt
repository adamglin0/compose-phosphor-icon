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

public val RegularGroup.`User-circle-gear`: ImageVector
    get() {
        if (`_user-circle-gear` != null) {
            return `_user-circle-gear`!!
        }
        `_user-circle-gear` = Builder(name = "User-circle-gear", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.25f, 63.07f)
                lineToRelative(-4.66f, -2.69f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, -8.76f)
                lineToRelative(4.66f, -2.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f)
                lineToRelative(-4.67f, 2.7f)
                arcTo(23.92f, 23.92f, 0.0f, false, false, 208.0f, 33.38f)
                lineTo(208.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(5.38f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, 4.39f)
                lineToRelative(-4.67f, -2.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.86f)
                lineToRelative(4.66f, 2.69f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, 8.76f)
                lineToRelative(-4.66f, 2.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f)
                lineToRelative(4.67f, -2.7f)
                arcTo(23.92f, 23.92f, 0.0f, false, false, 192.0f, 78.62f)
                lineTo(192.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 78.62f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, -4.39f)
                lineToRelative(4.67f, 2.7f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, 1.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -14.93f)
                close()
                moveTo(192.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 56.0f)
                close()
                moveTo(221.35f, 104.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.57f, 9.21f)
                arcTo(88.85f, 88.85f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, true, -22.24f, 58.41f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, -28.75f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.4f, 0.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -36.06f, 28.75f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(88.76f, 88.76f, 0.0f, false, true, 14.68f, 1.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, -15.78f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, false, 85.24f, 85.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 221.35f, 104.11f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(74.08f, 197.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 107.84f, 0.0f)
                arcToRelative(87.83f, 87.83f, 0.0f, false, true, -107.84f, 0.0f)
                close()
            }
        }
        .build()
        return `_user-circle-gear`!!
    }

private var `_user-circle-gear`: ImageVector? = null
