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

public val BoldGroup.`User-circle-gear-bold`: ImageVector
    get() {
        if (`_user-circle-gear-bold` != null) {
            return `_user-circle-gear-bold`!!
        }
        `_user-circle-gear-bold` = Builder(name = "User-circle-gear-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.57f, 46.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.12f, -7.7f)
                lineTo(188.0f, 39.48f)
                lineTo(188.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(3.48f)
                lineToRelative(3.31f, -1.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.42f, 22.82f)
                lineToRelative(-3.31f, 1.08f)
                lineToRelative(2.0f, 2.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, 14.1f)
                lineTo(200.0f, 76.42f)
                lineTo(198.0f, 79.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.41f, -14.1f)
                lineToRelative(2.0f, -2.82f)
                lineToRelative(-3.31f, -1.08f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 169.57f, 46.11f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcToRelative(109.19f, 109.19f, 0.0f, false, true, 18.0f, 1.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.0f, 23.67f)
                arcTo(85.0f, 85.0f, 0.0f, false, false, 128.0f, 44.0f)
                arcTo(83.94f, 83.94f, 0.0f, false, false, 62.05f, 179.94f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, true, 29.0f, -23.42f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, true, 29.0f, 23.42f)
                arcTo(83.57f, 83.57f, 0.0f, false, false, 212.0f, 128.0f)
                arcToRelative(85.2f, 85.2f, 0.0f, false, false, -1.16f, -14.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.67f, -4.0f)
                arcTo(109.0f, 109.0f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.53f, 83.53f, 0.0f, false, false, 48.43f, -15.43f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -96.86f, 0.0f)
                arcTo(83.53f, 83.53f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_user-circle-gear-bold`!!
    }

private var `_user-circle-gear-bold`: ImageVector? = null
