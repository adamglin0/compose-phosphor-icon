package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Castle-turret`: ImageVector
    get() {
        if (`_castle-turret` != null) {
            return `_castle-turret`!!
        }
        `_castle-turret` = Builder(name = "Castle-turret", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 216.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(115.31f)
                lineTo(211.31f, 104.0f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 216.0f, 92.69f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                verticalLineTo(92.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 44.69f, 104.0f)
                lineTo(56.0f, 115.31f)
                verticalLineTo(216.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(69.66f, 106.34f)
                lineTo(56.0f, 92.69f)
                verticalLineTo(48.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(92.69f)
                lineToRelative(-13.66f, 13.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(72.0f)
                verticalLineTo(112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 69.66f, 106.34f)
                close()
                moveTo(144.0f, 216.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_castle-turret`!!
    }

private var `_castle-turret`: ImageVector? = null
