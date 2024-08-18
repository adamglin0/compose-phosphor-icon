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

public val FillGroup.`User-circle-gear-fill`: ImageVector
    get() {
        if (`_user-circle-gear-fill` != null) {
            return `_user-circle-gear-fill`!!
        }
        `_user-circle-gear-fill` = Builder(name = "User-circle-gear-fill", defaultWidth = 256.0.dp,
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
                moveTo(200.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 64.0f)
                close()
                moveTo(128.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 76.0f)
                close()
                moveTo(230.56f, 110.68f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, true, -85.24f, -85.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.64f, 15.78f)
                arcTo(88.07f, 88.07f, 0.0f, false, false, 40.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f)
                arcTo(79.71f, 79.71f, 0.0f, false, true, 84.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0.0f, false, false, 78.27f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.84f, -0.32f)
                arcToRelative(79.86f, 79.86f, 0.0f, false, true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0.0f, false, false, 216.0f, 128.0f)
                arcToRelative(88.85f, 88.85f, 0.0f, false, false, -1.22f, -14.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f)
                close()
            }
        }
        .build()
        return `_user-circle-gear-fill`!!
    }

private var `_user-circle-gear-fill`: ImageVector? = null
