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

public val RegularGroup.Dress: ImageVector
    get() {
        if (_dress != null) {
            return _dress!!
        }
        _dress = Builder(name = "Dress", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.7f, 209.7f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, -0.25f)
                lineToRelative(-45.48f, -96.86f)
                lineToRelative(20.5f, -32.18f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.11f, -0.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -16.46f)
                curveToRelative(-0.09f, -0.16f, -0.2f, -0.32f, -0.3f, -0.47f)
                lineTo(168.0f, 32.7f)
                verticalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(32.42f)
                lineTo(146.74f, 39.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -37.48f, 0.0f)
                lineTo(104.0f, 32.42f)
                verticalLineTo(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 8.0f)
                verticalLineTo(32.7f)
                lineTo(66.58f, 63.3f)
                curveToRelative(-0.1f, 0.15f, -0.21f, 0.31f, -0.3f, 0.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 16.46f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.11f, 0.18f)
                lineToRelative(20.5f, 32.18f)
                lineTo(41.41f, 209.45f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, 0.25f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 232.0f)
                horizontalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.71f, -22.3f)
                close()
                moveTo(80.0f, 72.0f)
                lineTo(96.43f, 48.57f)
                lineToRelative(0.33f, 0.42f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 62.48f, 0.0f)
                lineToRelative(0.33f, -0.42f)
                lineTo(176.0f, 72.0f)
                lineToRelative(-20.38f, 32.0f)
                horizontalLineTo(100.39f)
                close()
                moveTo(56.0f, 216.0f)
                lineToRelative(45.07f, -96.0f)
                horizontalLineToRelative(53.84f)
                lineTo(200.0f, 216.0f)
                close()
            }
        }
        .build()
        return _dress!!
    }

private var _dress: ImageVector? = null
