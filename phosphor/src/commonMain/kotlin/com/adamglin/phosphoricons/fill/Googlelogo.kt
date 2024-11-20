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

public val FillGroup.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) {
            return _googleLogo!!
        }
        _googleLogo = Builder(name = "GoogleLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 181.34f, 68.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.67f, 11.92f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 191.5f, 136.0f)
                lineTo(128.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
        }
        .build()
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
