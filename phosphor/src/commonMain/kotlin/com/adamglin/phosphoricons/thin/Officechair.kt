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

public val ThinGroup.Officechair: ImageVector
    get() {
        if (_officechair != null) {
            return _officechair!!
        }
        _officechair = Builder(name = "Officechair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(219.82f, 132.0f)
                arcTo(44.06f, 44.06f, 0.0f, false, true, 176.0f, 172.0f)
                lineTo(132.0f, 172.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(132.0f, 212.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 172.0f)
                lineTo(80.0f, 172.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, true, -43.82f, -40.0f)
                lineTo(16.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(70.94f, 135.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.82f, -9.56f)
                lineToRelative(13.72f, -96.0f)
                arcTo(12.06f, 12.06f, 0.0f, false, true, 93.72f, 20.0f)
                horizontalLineToRelative(68.56f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, true, 11.88f, 10.3f)
                lineToRelative(13.72f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 140.0f)
                lineTo(80.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 70.94f, 135.86f)
                close()
                moveTo(76.94f, 130.62f)
                arcTo(3.93f, 3.93f, 0.0f, false, false, 80.0f, 132.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 3.0f, -1.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.94f, -3.19f)
                lineToRelative(-13.72f, -96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.43f)
                lineTo(93.72f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.43f)
                lineTo(76.0f, 127.43f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 77.0f, 130.62f)
                close()
            }
        }
        .build()
        return _officechair!!
    }

private var _officechair: ImageVector? = null
