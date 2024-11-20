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

public val LightGroup.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) {
            return _securityCamera!!
        }
        _securityCamera = Builder(name = "SecurityCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(195.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.59f)
                lineToRelative(-19.76f, -19.75f)
                lineTo(225.9f, 89.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                lineToRelative(-56.0f, -56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.81f, 0.0f)
                lineTo(4.34f, 160.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 10.0f, 174.0f)
                horizontalLineTo(50.2f)
                lineToRelative(35.9f, 35.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(59.76f, -59.76f)
                lineToRelative(19.75f, 19.76f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineTo(242.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(144.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 138.0f)
                close()
                moveTo(158.59f, 22.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineToRelative(14.1f, 14.1f)
                lineTo(50.2f, 162.0f)
                horizontalLineTo(19.64f)
                close()
                moveTo(97.41f, 201.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f)
                lineTo(61.17f, 168.0f)
                lineTo(184.0f, 45.17f)
                lineToRelative(33.41f, 33.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.82f)
                close()
            }
        }
        .build()
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
