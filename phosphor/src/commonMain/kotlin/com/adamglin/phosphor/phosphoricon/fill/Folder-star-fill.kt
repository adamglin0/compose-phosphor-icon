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

public val FillGroup.`Folder-star-fill`: ImageVector
    get() {
        if (`_folder-star-fill` != null) {
            return `_folder-star-fill`!!
        }
        `_folder-star-fill` = Builder(name = "Folder-star-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.09f, 167.78f)
                lineToRelative(-22.51f, 18.59f)
                lineToRelative(6.85f, 27.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, 8.81f)
                lineTo(184.0f, 207.82f)
                lineToRelative(-25.61f, 15.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, -8.81f)
                lineToRelative(6.85f, -27.71f)
                lineToRelative(-22.51f, -18.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, -14.14f)
                lineToRelative(29.84f, -2.31f)
                lineToRelative(11.43f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.7f, 0.0f)
                lineToRelative(11.43f, 26.5f)
                lineToRelative(29.84f, 2.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, 14.14f)
                close()
                moveTo(128.56f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(39.38f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 24.0f, 200.62f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 104.0f, 44.69f)
                lineTo(131.31f, 72.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(200.0f)
                horizontalLineToRelative(80.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.56f, 208.0f)
                close()
                moveTo(40.0f, 72.0f)
                horizontalLineToRelative(68.69f)
                lineToRelative(-16.0f, -16.0f)
                horizontalLineTo(40.0f)
                close()
            }
        }
        .build()
        return `_folder-star-fill`!!
    }

private var `_folder-star-fill`: ImageVector? = null
