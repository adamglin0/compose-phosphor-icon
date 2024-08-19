package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Train-regional`: ImageVector
    get() {
        if (`_train-regional` != null) {
            return `_train-regional`!!
        }
        `_train-regional` = Builder(name = "Train-regional", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.72f, 117.9f)
                lineTo(201.33f, 35.79f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 185.89f, 24.0f)
                lineTo(70.11f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 54.67f, 35.79f)
                lineTo(32.28f, 117.9f)
                arcToRelative(8.08f, 8.08f, 0.0f, false, false, 0.0f, 4.2f)
                lineToRelative(22.39f, 82.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 70.11f, 216.0f)
                lineTo(80.0f, 216.0f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, 9.6f)
                lineTo(100.0f, 216.0f)
                horizontalLineToRelative(56.0f)
                lineToRelative(21.6f, 28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.8f, -9.6f)
                lineTo(176.0f, 216.0f)
                horizontalLineToRelative(9.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.44f, -11.79f)
                lineToRelative(22.39f, -82.11f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 223.72f, 117.9f)
                close()
                moveTo(70.11f, 40.0f)
                lineTo(185.89f, 40.0f)
                lineTo(206.0f, 113.69f)
                lineToRelative(-78.0f, 14.18f)
                lineTo(50.0f, 113.69f)
                close()
                moveTo(51.11f, 130.14f)
                lineTo(120.0f, 142.68f)
                lineTo(120.0f, 200.0f)
                lineTo(70.11f, 200.0f)
                close()
                moveTo(185.89f, 200.0f)
                lineTo(136.0f, 200.0f)
                lineTo(136.0f, 142.68f)
                lineToRelative(68.94f, -12.54f)
                close()
                moveTo(88.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_train-regional`!!
    }

private var `_train-regional`: ImageVector? = null
