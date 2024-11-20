package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) {
            return _folderSimpleUser!!
        }
        _folderSimpleUser = Builder(name = "FolderSimpleUser", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.61f, 198.62f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.23f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -17.11f, 23.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.67f, 9.79f)
                arcTo(8.15f, 8.15f, 0.0f, false, false, 160.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.73f, -5.95f)
                curveTo(170.56f, 215.42f, 180.54f, 208.0f, 192.0f, 208.0f)
                reflectiveCurveToRelative(21.44f, 7.42f, 24.27f, 18.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.46f, -4.11f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 214.61f, 198.62f)
                close()
                moveTo(192.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 160.0f)
                close()
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                lineTo(130.67f, 88.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, -9.6f, -3.2f)
                lineTo(93.33f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 200.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(93.33f, 48.0f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, true, 9.6f, 3.2f)
                lineTo(130.67f, 72.0f)
                lineTo(216.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
            }
        }
        .build()
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
