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

public val ThinGroup.FileVue: ImageVector
    get() {
        if (_fileVue != null) {
            return _fileVue!!
        }
        _fileVue = Builder(name = "FileVue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.77f, 153.35f)
                lineToRelative(-20.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.54f, 0.0f)
                lineToRelative(-20.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.54f, -2.7f)
                lineTo(60.0f, 196.11f)
                lineToRelative(16.23f, -45.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.54f, 2.7f)
                close()
                moveTo(208.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(176.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 184.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(180.0f, 176.0f)
                lineTo(180.0f, 156.0f)
                close()
                moveTo(144.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -28.0f, 0.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                lineTo(148.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 148.0f)
                close()
                moveTo(212.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineToRelative(56.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 88.0f)
                close()
                moveTo(198.34f, 84.0f)
                lineTo(156.0f, 41.65f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
