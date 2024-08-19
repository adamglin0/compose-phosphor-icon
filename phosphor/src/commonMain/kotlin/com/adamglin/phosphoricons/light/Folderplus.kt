package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Folderplus: ImageVector
    get() {
        if (_folderplus != null) {
            return _folderplus!!
        }
        _folderplus = Builder(name = "Folderplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 74.0f)
                horizontalLineTo(130.49f)
                lineToRelative(-27.9f, -27.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                verticalLineTo(200.62f)
                arcTo(13.39f, 13.39f, 0.0f, false, false, 39.38f, 214.0f)
                horizontalLineTo(216.89f)
                arcTo(13.12f, 13.12f, 0.0f, false, false, 230.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(40.0f, 54.0f)
                horizontalLineTo(92.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineTo(113.51f, 74.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
                moveTo(218.0f, 200.89f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -1.11f, 1.11f)
                horizontalLineTo(39.38f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 38.0f, 200.62f)
                verticalLineTo(86.0f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(158.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(150.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 144.0f)
                close()
            }
        }
        .build()
        return _folderplus!!
    }

private var _folderplus: ImageVector? = null
