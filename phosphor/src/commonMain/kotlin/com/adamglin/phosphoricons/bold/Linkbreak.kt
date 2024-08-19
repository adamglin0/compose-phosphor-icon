package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Linkbreak: ImageVector
    get() {
        if (_linkbreak != null) {
            return _linkbreak!!
        }
        _linkbreak = Builder(name = "Linkbreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.8f, 60.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.51f, -0.09f)
                lineTo(144.68f, 72.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.36f, -16.56f)
                lineTo(139.0f, 43.43f)
                lineToRelative(0.2f, -0.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 73.54f, 73.54f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-12.29f, 11.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.56f, -17.36f)
                lineToRelative(12.17f, -11.61f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 195.8f, 60.2f)
                close()
                moveTo(111.32f, 183.72f)
                lineTo(99.71f, 195.89f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, -39.6f)
                lineToRelative(12.17f, -11.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.56f, -17.36f)
                lineTo(43.43f, 139.0f)
                lineToRelative(-0.2f, 0.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.54f, 73.54f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(11.71f, -12.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.36f, -16.56f)
                close()
                moveTo(216.0f, 148.0f)
                lineTo(192.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(40.0f, 108.0f)
                lineTo(64.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 192.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 180.0f)
                close()
                moveTo(96.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(108.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(84.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 76.0f)
                close()
            }
        }
        .build()
        return _linkbreak!!
    }

private var _linkbreak: ImageVector? = null
