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

public val FillGroup.FunnelX: ImageVector
    get() {
        if (_funnelX != null) {
            return _funnelX!!
        }
        _funnelX = Builder(name = "FunnelX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.73f, 66.85f)
                lineTo(160.0f, 139.17f)
                verticalLineToRelative(55.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.87f, 208.0f)
                lineToRelative(-32.0f, 21.34f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 216.0f)
                verticalLineTo(139.17f)
                lineTo(28.27f, 66.85f)
                lineToRelative(-0.08f, -0.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.84f, 26.76f)
                close()
                moveTo(227.31f, 192.0f)
                lineToRelative(18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(216.0f, 180.69f)
                lineToRelative(-18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(204.69f, 192.0f)
                lineToRelative(-18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(216.0f, 203.31f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
