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

public val LightGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.0f, 92.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 146.0f, 92.0f)
                close()
                moveTo(100.0f, 82.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 82.0f)
                close()
                moveTo(246.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(214.0f, 134.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(85.88f, 85.88f, 0.0f, false, true, -3.45f, 24.08f)
                lineTo(234.4f, 178.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, 11.0f)
                lineToRelative(-23.23f, -10.15f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -156.74f, 0.0f)
                lineTo(26.4f, 189.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.8f, -11.0f)
                lineToRelative(23.85f, -10.42f)
                arcTo(85.88f, 85.88f, 0.0f, false, true, 42.0f, 144.0f)
                lineTo(42.0f, 134.0f)
                lineTo(16.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(42.0f, 122.0f)
                lineTo(42.0f, 112.0f)
                arcToRelative(85.88f, 85.88f, 0.0f, false, true, 3.45f, -24.08f)
                lineTo(21.6f, 77.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.8f, -11.0f)
                lineTo(49.63f, 76.65f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 156.74f, 0.0f)
                lineTo(229.6f, 66.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.8f, 11.0f)
                lineTo(210.55f, 87.92f)
                arcTo(85.88f, 85.88f, 0.0f, false, true, 214.0f, 112.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(54.0f, 122.0f)
                lineTo(202.0f, 122.0f)
                lineTo(202.0f, 112.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                close()
                moveTo(122.0f, 217.74f)
                lineTo(122.0f, 134.0f)
                lineTo(54.0f, 134.0f)
                verticalLineToRelative(10.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, false, 122.0f, 217.74f)
                close()
                moveTo(202.0f, 134.0f)
                lineTo(134.0f, 134.0f)
                verticalLineToRelative(83.74f)
                arcTo(74.09f, 74.09f, 0.0f, false, false, 202.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
