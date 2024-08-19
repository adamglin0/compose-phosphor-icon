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

public val BoldGroup.`Users-bold`: ImageVector
    get() {
        if (`_users-bold` != null) {
            return `_users-bold`!!
        }
        `_users-bold` = Builder(name = "Users-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.18f, 156.94f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -82.36f, 0.0f)
                arcToRelative(100.23f, 100.23f, 0.0f, false, false, -39.49f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.35f, 14.2f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 122.64f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.36f, -14.2f)
                arcTo(100.33f, 100.33f, 0.0f, false, false, 125.18f, 156.94f)
                close()
                moveTo(44.0f, 108.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 44.0f, 108.0f)
                close()
                moveTo(250.1f, 205.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, -2.57f)
                arcTo(76.31f, 76.31f, 0.0f, false, false, 172.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -10.3f, -78.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -6.16f, -23.19f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 57.64f, 110.8f)
                arcToRelative(100.23f, 100.23f, 0.0f, false, true, 39.49f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 250.1f, 205.67f)
                close()
            }
        }
        .build()
        return `_users-bold`!!
    }

private var `_users-bold`: ImageVector? = null
