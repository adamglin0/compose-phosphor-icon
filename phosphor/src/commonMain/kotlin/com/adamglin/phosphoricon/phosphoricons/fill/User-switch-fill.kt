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

public val FillGroup.`User-switch-fill`: ImageVector
    get() {
        if (`_user-switch-fill` != null) {
            return `_user-switch-fill`!!
        }
        `_user-switch-fill` = Builder(name = "User-switch-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 84.0f, 120.0f)
                close()
                moveTo(210.16f, 177.18f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, -10.86f, 2.41f)
                arcToRelative(87.42f, 87.42f, 0.0f, false, true, -5.52f, 6.85f)
                arcTo(79.76f, 79.76f, 0.0f, false, false, 172.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, 0.32f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, true, -78.26f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0.0f, false, false, -21.79f, 21.31f)
                arcTo(87.66f, 87.66f, 0.0f, false, true, 40.37f, 136.0f)
                horizontalLineToRelative(15.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.69f, -3.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.8f, -10.38f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.8f, 10.38f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 8.23f, 136.0f)
                lineTo(24.3f, 136.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 188.18f, 52.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 210.16f, 177.18f)
                close()
                moveTo(255.39f, 124.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 120.0f)
                lineTo(231.7f, 120.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 43.52f, 67.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 9.34f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 215.63f, 120.0f)
                lineTo(200.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(24.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 255.39f, 124.94f)
                close()
            }
        }
        .build()
        return `_user-switch-fill`!!
    }

private var `_user-switch-fill`: ImageVector? = null
