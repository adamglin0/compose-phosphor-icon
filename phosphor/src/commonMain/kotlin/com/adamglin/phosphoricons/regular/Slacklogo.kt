package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) {
            return _slackLogo!!
        }
        _slackLogo = Builder(name = "SlackLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.13f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 184.0f, 76.31f)
                lineTo(184.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -56.0f, -21.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 76.31f, 72.0f)
                lineTo(56.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -21.13f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 72.0f, 179.69f)
                lineTo(72.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.0f, 21.13f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 179.69f, 184.0f)
                lineTo(200.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 21.13f, -56.0f)
                close()
                moveTo(72.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                lineTo(72.0f, 136.0f)
                close()
                moveTo(120.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(88.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(120.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(120.0f, 72.0f)
                lineTo(104.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                close()
                moveTo(136.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(136.0f, 120.0f)
                close()
                moveTo(152.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(200.0f, 168.0f)
                lineTo(152.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(200.0f, 120.0f)
                lineTo(184.0f, 120.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
