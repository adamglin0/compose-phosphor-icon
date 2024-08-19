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

public val BoldGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 88.0f)
                close()
                moveTo(100.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.0f, 72.0f)
                close()
                moveTo(220.0f, 144.0f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, true, -2.34f, 20.64f)
                lineTo(236.81f, 173.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.62f, 22.0f)
                lineToRelative(-18.0f, -7.85f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -162.46f, 0.0f)
                lineToRelative(-18.0f, 7.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -9.62f, -22.0f)
                lineToRelative(19.15f, -8.36f)
                arcTo(91.84f, 91.84f, 0.0f, false, true, 36.0f, 144.0f)
                verticalLineToRelative(-4.0f)
                lineTo(16.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(36.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, true, 2.34f, -20.64f)
                lineTo(19.19f, 83.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.62f, -22.0f)
                lineToRelative(18.0f, 7.85f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 162.46f, 0.0f)
                lineToRelative(18.0f, -7.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 9.62f, 22.0f)
                lineToRelative(-19.15f, 8.36f)
                arcTo(91.84f, 91.84f, 0.0f, false, true, 220.0f, 112.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(220.0f, 140.0f)
                close()
                moveTo(60.0f, 116.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f)
                close()
                moveTo(116.0f, 210.92f)
                lineTo(116.0f, 140.0f)
                lineTo(60.0f, 140.0f)
                verticalLineToRelative(4.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 116.0f, 210.92f)
                close()
                moveTo(196.0f, 144.0f)
                verticalLineToRelative(-4.0f)
                lineTo(140.0f, 140.0f)
                verticalLineToRelative(70.92f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 196.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
