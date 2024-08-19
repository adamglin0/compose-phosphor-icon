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

public val ThinGroup.Videocameraslash: ImageVector
    get() {
        if (_videocameraslash != null) {
            return _videocameraslash!!
        }
        _videocameraslash = Builder(name = "Videocameraslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.89f, 76.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.11f, 0.2f)
                lineTo(204.0f, 104.53f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(113.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(87.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-8.16f)
                lineToRelative(41.78f, 27.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 252.0f, 176.0f)
                verticalLineTo(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 249.89f, 76.47f)
                close()
                moveTo(244.0f, 168.53f)
                lineToRelative(-40.0f, -26.67f)
                verticalLineTo(114.14f)
                lineToRelative(40.0f, -26.67f)
                close()
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(60.78f, 60.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(184.41f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(32.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(68.05f)
                lineTo(177.14f, 188.0f)
                close()
            }
        }
        .build()
        return _videocameraslash!!
    }

private var _videocameraslash: ImageVector? = null
