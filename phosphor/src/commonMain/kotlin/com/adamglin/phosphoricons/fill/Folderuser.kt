package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Folderuser: ImageVector
    get() {
        if (_folderuser != null) {
            return _folderuser!!
        }
        _folderuser = Builder(name = "Folderuser", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(200.0f)
                horizontalLineToRelative(80.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(39.38f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 24.0f, 200.62f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 104.0f, 44.69f)
                lineTo(131.31f, 72.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
                moveTo(108.69f, 72.0f)
                lineToRelative(-16.0f, -16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(72.0f)
                close()
            }
        }
        .build()
        return _folderuser!!
    }

private var _folderuser: ImageVector? = null
