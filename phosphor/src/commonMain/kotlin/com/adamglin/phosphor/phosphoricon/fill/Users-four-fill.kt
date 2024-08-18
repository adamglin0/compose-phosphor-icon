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

public val FillGroup.`Users-four-fill`: ImageVector
    get() {
        if (`_users-four-fill` != null) {
            return `_users-four-fill`!!
        }
        `_users-four-fill` = Builder(name = "Users-four-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.4f, 219.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                arcTo(67.88f, 67.88f, 0.0f, false, true, 53.0f, 197.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.93f, 0.0f)
                arcToRelative(67.42f, 67.42f, 0.0f, false, true, 21.0f, 14.29f)
                arcToRelative(67.42f, 67.42f, 0.0f, false, true, 21.0f, -14.29f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.93f, 0.0f)
                arcTo(67.85f, 67.85f, 0.0f, false, true, 230.4f, 219.19f)
                close()
                moveTo(27.2f, 126.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.2f, -1.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, -9.61f)
                arcTo(67.85f, 67.85f, 0.0f, false, false, 203.0f, 93.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.93f, 0.0f)
                arcToRelative(67.42f, 67.42f, 0.0f, false, false, -21.0f, 14.29f)
                arcToRelative(67.42f, 67.42f, 0.0f, false, false, -21.0f, -14.29f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.93f, 0.0f)
                arcTo(67.88f, 67.88f, 0.0f, false, false, 25.6f, 115.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 27.2f, 126.4f)
                close()
            }
        }
        .build()
        return `_users-four-fill`!!
    }

private var `_users-four-fill`: ImageVector? = null
