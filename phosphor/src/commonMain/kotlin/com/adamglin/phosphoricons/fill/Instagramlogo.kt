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

public val FillGroup.Instagramlogo: ImageVector
    get() {
        if (_instagramlogo != null) {
            return _instagramlogo!!
        }
        _instagramlogo = Builder(name = "Instagramlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 24.0f)
                lineTo(80.0f, 24.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f)
                lineTo(232.0f, 80.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 176.0f, 24.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 128.0f, 176.0f)
                close()
                moveTo(188.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 80.0f)
                close()
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 128.0f)
                close()
            }
        }
        .build()
        return _instagramlogo!!
    }

private var _instagramlogo: ImageVector? = null
