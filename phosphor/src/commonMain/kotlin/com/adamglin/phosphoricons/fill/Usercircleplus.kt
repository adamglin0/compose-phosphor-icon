package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Usercircleplus: ImageVector
    get() {
        if (_usercircleplus != null) {
            return _usercircleplus!!
        }
        _usercircleplus = Builder(name = "Usercircleplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 76.0f)
                close()
                moveTo(176.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(192.0f, 48.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(221.35f, 104.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.57f, 9.21f)
                arcTo(88.85f, 88.85f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, true, -22.24f, 58.41f)
                arcTo(79.86f, 79.86f, 0.0f, false, false, 172.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0.0f, false, true, -78.27f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0.0f, false, false, -21.79f, 21.31f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                arcToRelative(88.76f, 88.76f, 0.0f, false, true, 14.68f, 1.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.64f, -15.78f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, false, 85.24f, 85.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 221.35f, 104.11f)
                close()
            }
        }
        .build()
        return _usercircleplus!!
    }

private var _usercircleplus: ImageVector? = null
