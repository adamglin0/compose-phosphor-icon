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

public val FillGroup.ClockUser: ImageVector
    get() {
        if (_clockUser != null) {
            return _clockUser!!
        }
        _clockUser = Builder(name = "ClockUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 72.0f)
                verticalLineToRelative(43.06f)
                lineToRelative(36.42f, -18.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                lineTo(120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(214.62f, 198.62f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.24f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 152.27f, 222.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 232.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.73f, -10.06f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 214.62f, 198.62f)
                close()
            }
        }
        .build()
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
