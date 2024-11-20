package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.FolderUser: ImageVector
    get() {
        if (_folderUser != null) {
            return _folderUser!!
        }
        _folderUser = Builder(name = "FolderUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.5f, 199.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -31.0f, 0.0f)
                arcTo(36.24f, 36.24f, 0.0f, false, false, 156.13f, 223.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.84f, 4.89f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 1.0f, 0.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.87f, -3.0f)
                curveToRelative(3.29f, -12.38f, 14.85f, -21.0f, 28.13f, -21.0f)
                reflectiveCurveToRelative(24.84f, 8.65f, 28.13f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.73f, -2.05f)
                arcTo(36.22f, 36.22f, 0.0f, false, false, 207.5f, 199.3f)
                close()
                moveTo(172.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 172.0f, 176.0f)
                close()
                moveTo(216.0f, 76.0f)
                horizontalLineTo(129.66f)
                lineTo(101.17f, 47.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.69f, 44.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineTo(200.61f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.38f, 212.0f)
                horizontalLineToRelative(81.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(39.38f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 36.0f, 200.61f)
                verticalLineTo(84.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(40.0f, 52.0f)
                horizontalLineTo(92.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineTo(118.34f, 76.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 52.0f)
                close()
            }
        }
        .build()
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
