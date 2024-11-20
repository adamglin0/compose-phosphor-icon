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

public val ThinGroup.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) {
            return _microsoftPowerpointLogo!!
        }
        _microsoftPowerpointLogo = Builder(name = "MicrosoftPowerpointLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 100.0f)
                lineTo(80.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(96.0f, 132.0f)
                lineTo(84.0f, 132.0f)
                lineTo(84.0f, 108.0f)
                lineTo(96.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(136.0f, 28.0f)
                arcTo(100.3f, 100.3f, 0.0f, false, false, 56.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(56.0f, 188.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 136.0f, 28.0f)
                close()
                moveTo(227.91f, 124.0f)
                lineTo(156.0f, 124.0f)
                lineTo(156.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(140.0f, 36.09f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 227.91f, 124.0f)
                close()
                moveTo(132.0f, 36.1f)
                lineTo(132.0f, 68.0f)
                lineTo(66.26f, 68.0f)
                arcTo(92.36f, 92.36f, 0.0f, false, true, 132.0f, 36.1f)
                close()
                moveTo(36.0f, 176.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(144.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 176.0f)
                close()
                moveTo(66.26f, 188.0f)
                lineTo(132.0f, 188.0f)
                verticalLineToRelative(31.9f)
                arcTo(92.36f, 92.36f, 0.0f, false, true, 66.26f, 188.0f)
                close()
                moveTo(140.0f, 219.91f)
                lineTo(140.0f, 188.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(156.0f, 132.0f)
                horizontalLineToRelative(71.91f)
                arcTo(92.13f, 92.13f, 0.0f, false, true, 140.0f, 219.91f)
                close()
            }
        }
        .build()
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
