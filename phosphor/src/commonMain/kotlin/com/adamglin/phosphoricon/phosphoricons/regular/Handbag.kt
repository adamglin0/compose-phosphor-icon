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

public val RegularGroup.Handbag: ImageVector
    get() {
        if (_handbag != null) {
            return _handbag!!
        }
        _handbag = Builder(name = "Handbag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.89f, 198.12f)
                lineToRelative(-14.26f, -120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -14.12f)
                horizontalLineTo(176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                horizontalLineTo(46.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 14.12f)
                lineToRelative(-14.26f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 20.0f, 210.6f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 12.0f, 5.4f)
                horizontalLineTo(223.92f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 236.0f, 210.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.89f, 198.12f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                horizontalLineTo(96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(32.0f, 200.0f)
                lineTo(46.33f, 80.0f)
                horizontalLineTo(80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(80.0f)
                horizontalLineToRelative(33.75f)
                lineToRelative(14.17f, 120.0f)
                close()
            }
        }
        .build()
        return _handbag!!
    }

private var _handbag: ImageVector? = null
