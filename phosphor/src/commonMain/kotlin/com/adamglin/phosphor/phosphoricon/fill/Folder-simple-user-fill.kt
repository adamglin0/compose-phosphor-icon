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

public val FillGroup.`Folder-simple-user-fill`: ImageVector
    get() {
        if (`_folder-simple-user-fill` != null) {
            return `_folder-simple-user-fill`!!
        }
        `_folder-simple-user-fill` = Builder(name = "Folder-simple-user-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.73f, 221.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f)
                horizontalLineTo(160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.27f, 222.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 17.11f, -23.33f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.24f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 231.73f, 221.94f)
                close()
                moveTo(216.0f, 72.0f)
                horizontalLineTo(130.67f)
                lineTo(102.93f, 51.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(93.33f)
                lineToRelative(27.74f, 20.8f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, 9.6f, 3.2f)
                horizontalLineTo(216.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_folder-simple-user-fill`!!
    }

private var `_folder-simple-user-fill`: ImageVector? = null
