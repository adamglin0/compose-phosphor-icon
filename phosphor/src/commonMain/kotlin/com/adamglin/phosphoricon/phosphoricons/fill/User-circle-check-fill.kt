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

public val FillGroup.`User-circle-check-fill`: ImageVector
    get() {
        if (`_user-circle-check-fill` != null) {
            return `_user-circle-check-fill`!!
        }
        `_user-circle-check-fill` = Builder(name = "User-circle-check-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.56f, 110.68f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, true, -85.24f, -85.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.64f, 15.78f)
                arcTo(88.07f, 88.07f, 0.0f, false, false, 40.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f)
                arcTo(79.71f, 79.71f, 0.0f, false, true, 84.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.84f, 0.32f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, false, 78.26f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.84f, -0.32f)
                arcToRelative(79.86f, 79.86f, 0.0f, false, true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0.0f, false, false, 216.0f, 128.0f)
                arcToRelative(88.85f, 88.85f, 0.0f, false, false, -1.22f, -14.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f)
                close()
                moveTo(84.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 84.0f, 120.0f)
                close()
                moveTo(237.66f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(200.0f, 60.69f)
                lineTo(189.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 34.34f)
                close()
            }
        }
        .build()
        return `_user-circle-check-fill`!!
    }

private var `_user-circle-check-fill`: ImageVector? = null
