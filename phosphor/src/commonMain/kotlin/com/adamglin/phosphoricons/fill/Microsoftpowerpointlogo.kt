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

public val FillGroup.Microsoftpowerpointlogo: ImageVector
    get() {
        if (_microsoftpowerpointlogo != null) {
            return _microsoftpowerpointlogo!!
        }
        _microsoftpowerpointlogo = Builder(name = "Microsoftpowerpointlogo", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 24.0f)
                arcTo(104.33f, 104.33f, 0.0f, false, false, 54.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(54.0f, 192.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 136.0f, 24.0f)
                close()
                moveTo(72.0f, 152.0f)
                lineTo(72.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                lineTo(88.0f, 144.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 215.63f)
                arcTo(88.36f, 88.36f, 0.0f, false, true, 75.63f, 192.0f)
                lineTo(128.0f, 192.0f)
                close()
                moveTo(128.0f, 64.0f)
                lineTo(75.63f, 64.0f)
                arcTo(88.36f, 88.36f, 0.0f, false, true, 128.0f, 40.37f)
                close()
                moveTo(144.0f, 40.37f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 223.63f, 120.0f)
                lineTo(160.0f, 120.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(144.0f, 215.63f)
                lineTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(160.0f, 136.0f)
                horizontalLineToRelative(63.63f)
                arcTo(88.13f, 88.13f, 0.0f, false, true, 144.0f, 215.63f)
                close()
                moveTo(96.0f, 128.0f)
                lineTo(88.0f, 128.0f)
                lineTo(88.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _microsoftpowerpointlogo!!
    }

private var _microsoftpowerpointlogo: ImageVector? = null
